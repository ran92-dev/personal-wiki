import logging
from tenacity import before_sleep_log,retry, stop_after_attempt, wait_exponential_jitter, retry_if_exception

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

@retry(
    stop=stop_after_attempt(5),
    wait=wait_exponential_jitter(initial=1, max=10),
    retry=retry_if_exception(should_retry),
    before_sleep=before_sleep_log(logger, logging.WARNING),
    reraise=True
)
def call_service():
    response = requests.post(
        "http://127.0.0.1:8000/api/start-pipeline",
        timeout=3
    )
    response.raise_for_status()
    return response.json()

