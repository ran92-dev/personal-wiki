Retires are not about errors
They are about temporary vs permanent failures.

Https response code:
1xx--- Informational 
100 - continue            No retry
101 - Switching protocols No retry

2xx--- Success
200    OK  No retry
201    Created No retry
202    Accepted No retry
204    No Content No retry


3xx ---- Redirect
301   Moved permanently  No retry
302   Found               No retry
307   Temporary redirect   No retry

Do not retry manually.
If redirect fails -> then become 4x/5x


4xx ----- Client Errors
means your request is wrong

Retrying wrong input makes things worse.

400    bad request   invalid payload
401    Unauthorized   Bad/missing credendials
403    Forbidden      No permission
404    Not found      resource does not exist
405    method not allowed Wrong http method
422    Validation error    Invalid data

Retrying this is pointless


Conditional Retry
408      Request Timeout   yes, Retry
409      Conflict          Depends, whether to Retry
If idempotent operation maybe retry, resource locked - retry, permanent business rule conflict-do NOT retry
429      Too many requests  Yes 
Always retry
Respect Retry-After header if Present
Use exponential backoff

5xx---- Server Errors
500         Internal Server Error    Yes , Retry
502         Bade Gateway             Yes, 
503         Service unavaiable       yes
504         Gateway timeout          yes


501         Not implemented         No
505         Http version not supported No


Network errors
DNS failure  yes, Retry
Connection refused, Yes Retry
Timeout, yes retry
Connection reset , yes




Bsically, 
retry on
Network errors
408
429
500
502
503
504

Do NOT Retry On:

400

401

403

404

405

422

501

505

RETRY_STATUS_CODES = {408, 429, 500, 502, 503, 504}






