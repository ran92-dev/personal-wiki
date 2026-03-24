'''
Coding Patterns are reusable problem-solving templates, Instead of memorizing 300 problems , you master 12-20 patterns.'''

Sliding Window:
- Subarray
- Substring
- Longest/Shortest
- Continuous elements
- At most K
- Exactly K
- Without repeating

## Examples Problems:
    - Longest substring without repeating characters.
    - Maximum sum subarray of size k. 

## Core Idea:
    - Instead of checking all subarrays, O(n2), we maintain a window that slides across the array 
    in O(n)
    - Expand the window ( right pointer )
    - Shrink the window( left pointer)
    Maintain some condition

# ![alt text](image.png)

# ![alt text](image-1.png)

## If Element must be continious , think sliding windows first.

# Types of sliding Window
    - Fixed size window: ex-> subarray of size k with max sum
        - Pattern:
            - Compute first sliding window
            - Slide by removing left
            - Add right
            - Update answer

        - Time : O(n)
        - Space: O(1)
    - Variable size window: ex-> Longest substring without repeating characters.
        - At most K distinct
        - Minimum window substring
        - Fruits into baskets
        - Character replacement
        
        - Core Patter:
            -

 ## Advanced Sliding Window Concepts
  - Monotonic Deque (Very Advanced)
  - Sliding windows + Prefix sum
   

