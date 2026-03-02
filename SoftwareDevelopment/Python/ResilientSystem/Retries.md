Python Retry module
Features:
1. No external dependency
2. Preserve function signature
3. Easy to debug


params;
exceptions: an exception or tuple of exceptions to catch. default is Exception
tries: the maximum no of attempts. default -1 (infinite)
delay: initial delay between attempts. default 0  
max_delay: the max value for delay. default None
backoff: multiplier applied to delay between attempts. default 1 ( no backoff)
jitter: extra seconds added to delay between attempts. deafult : 0 
        fixed if a number, random if a range tuple (min,max)
logger: logger.warning(fmt, error, delay) will be called on failed attempts.
        default: retry.logging_logger. if none, logging is disabled.


from retry import retry

@retry()
def make_trouble():
  '''Retry until succeed'''
@retry(ZeroDivisionError, tries=3, delay=2)

@retry((ValueError, TypeError), delay=1, backoff=2)

@retry((ValueError, TypeError), delay=1. backoff=2, max_delay=4)
@retry(ValueError, delay=1, jitter=1)
'Retry on ValueError, sleep 1, 2, 3, 4, ... seconds between attempts.
if __name__ == '__main__':
    import logging
    logging.basicConfig()
    make_trouble()

Use logging to get logs for retry


retry_call()
calls a function and re-executes it if it failed.
it takes f: function to execute, fargs: fkwargs named argument, then all other @retry decorator argument
the reason behind this is to dynamically adjust the retry arguments
In @decorator we cannot do so


Jitter Strategy:
1. Full jitter: ( most recommended )
2. Equal jitter:
3. Decorrelated jitter

IdempotCency:
If you retry

POST /create-run

Without idempotency we may get duplicated run created.
So :

POST /create-order
without idempotentcy you may create duplicate records
So:
use idempotency keys
Or make operations safe to retry


Circuit Breaker:
Retry alone is not enough.
Modern system combines
Retry + backoff + jitter
Circuit Breaker pattern
Timeout limits
Bulkhead isolation


A healthy design should include
Timeout -> Retry ( with backoff + jitter ) -> circuit Breaker -> Monitoring


Rules:
Small retry count ( 2-3 max)
Short timeout
Only retry transient errors
use idempotent operations
Add jitter

When to use Retry and Circuite Breaker?
1. Retry is for transient failures. Circuit breaker is for persistent failures. 
Retry reduces temporary errors. Circuite Breaker prevent cascading failures.


Retry only at one layer
otherwise we will have services retring other services That’s retry amplification 💥
Retry only at the edge OR only at the caller layer.
2️⃣ Always Use Timeout

No timeout = infinite hanging threa
Timeout < Retry Backoff Window

Example:

Timeout: 1 second

Retry delay: exponential 1s, 2s

Max attempts: 3
3️⃣ Add Jitter

Without jitter:

All services retry at 2s → spike
With jitter:

Retries spread over time → smooth recovery

4️⃣ Add Circuit Breaker

If Payment Service keeps failing:

Circuit breaker opens.

Then:

Order Service → Fail fast immediately

No more retries until recovery window.
🎯 Summary

A healthy microservice retry system includes:

Timeout → Retry (backoff + jitter) → Circuit Breaker → Metrics → Alerting


Example: 
Script  →  Your Service  →  GitLab Pipeline API
Identify Failure types:
a. Network timeout ( temporary)
b. Service temporarily overloaded
c. GitLab API slow/down
d. Bad request ( your bug- don't retry)
e. Auth failure ( dobn't retry)

We should retry only transient errors.

Retry at script level 1 Boundary
Timeout-> Retry (2-3 times) Exponential backoff + Jitter
Max retry: 3
Timeout per call: 5-10 second
backoff: exponential
add jitter: 
Retry only on: 500, 502, 503, 504 , Connection timeout

Do not retry: 400, 401, 403, 404



