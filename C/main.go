package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	reader := bufio.NewReader(os.Stdin)

	var N int
	fmt.Fscan(reader, &N)
	A := make([]int, 3*N)
	B := make([]int, N)
	for i := 0; i < 3*N; i++ {
		var input int
		fmt.Fscan(reader, &input)
		A[i] = input
		B[A[i]-1] += 1
		if B[A[i]-1] == 2 {
			fmt.Println(A[i])
		}
	}
}
