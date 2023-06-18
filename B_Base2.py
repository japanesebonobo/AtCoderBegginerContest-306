def main():
    A = [0] * 64
    input_line = input()
    input_values = input_line.split()

    for i in range(64):
        A[i] = int(input_values[i])
    
    ans = 0
    for i in range(len(A)):
        ans += A[i] << i
    
    print(ans)

if __name__ == "__main__":
    main()