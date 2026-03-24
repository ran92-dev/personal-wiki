'''
Print every alternate element of an array. Starting from first elememt.
'''

def printAlternates(arr):
    if len(arr) == 1 or len(arr) == 2:
        print(arr[0])
    else:
        for i in range(0, len(arr), 2):
            print(arr[i])

def getAlternates(arr):
    if len(arr) == 1 or len(arr) == 2:
        return [arr[0]]
    else:
        result = []
        for i in range(0, len(arr), 2):
            result.append(arr[i])
        return result
    
if __name__ == "__main__":
    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    printAlternates(arr)
    print(getAlternates(arr))