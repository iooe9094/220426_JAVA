package JAVA_BASIC;

// import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        // int[] arr = {10, 20, 30, 50, 3, 60, -3};

        // 문제 1번. 인덱스가 1인 곳의 값을 출력
        // System.out.println(arr[1]);

        // 문제 2번. 60인 곳의 인덱스를 출력
        // 전통적인 for문 사용
        // for (int i=0; i<arr.length; i++) {
        //     if(arr[i] == 60) {
        //         System.out.println(i);
        //     }
        // }

        // 문제 3번. 모든 값을 더하고 총합과 평균을 구하라
        // int sum = 0;
        // double avg = 0.0;

        // for (int i=0; i<arr.length; i++) {
        //     sum += arr[i];
        // }
        // System.out.println("Sum : " + sum);
        // avg = (sum / arr.length);
        // System.out.println("AVG : " + avg);

        // 문제 4번. arr 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하라
        // for (int i=0; i<arr.length; i++) {
        //     if(i == 3) {
        //         continue;
        //     }
        //     System.out.print(arr[i] + " ");
        // }

        // 문제 5번. 인덱스 3의 값을 1000으로 변경하여 출력하기
        // 5-1 풀이
        // Scanner scanner = new Scanner(System.in);

        // int choice = scanner.nextInt();

        // arr[choice] = 1000;

        // for(int i=0; i<arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // 5-2 내가 한 풀이
        // for (int i=0; i<arr.length; i++) {
        //     if(i==3) {
        //         arr[i] = 1000;
        //     }
        //     System.out.print(arr[i] + " ");
        // }

        // 문제 6번. 인덱스 1과 인덱스 2의 값을 변경하여 출력하기
        // Scanner scn = new Scanner(System.in);
        // Scanner scn2 = new Scanner(System.in);

        // int tmp;

        // System.out.println("첫 번째 숫자를 입력하세요");
        // int num1 = scn.nextInt();

        // System.out.println("두 번째 숫자를 입력하세요");
        // int num2 = scn2.nextInt();

        // tmp = arr[num1];
        // arr[num1] = arr[num2];
        // arr[num2] = tmp;

        // for(int i=0; i<arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // System.out.print(arr + " ");

        // 문제 7번. 최대값과 최소값을 구하여 출력하기
        // int max = arr[0]; // 초기화
        // int min = arr[0];

        // for(int x : arr) {
        //     if(x > max) {
        //         max = x;
        //     } else if (x < min) {
        //         min = x;
        //     }
        // }
        // System.out.println("max: " + max + " min: " + min);

        // 문제 8번. char 배열을 생성하여, 알파벳 A~Z까지 대입 후 출력하기. 알파벳은 총 26개
        // 숫자를 아스키코드로 변환하여 단순 출력한 코드
         // for(int i=90; i>=65; i--) {
        //     System.out.print((char)i + " ");
        // }

        // 26개의 문자 배열 생성
        // char[] arr = new char[26];

        // for(int i=0; i<=arr.length; i++) {
        //     // 문자를 아스키코드 숫자로 변환
        //     // 'A' -> 아스키코드 65
        //     // 'A' -> 아스키코드 'A' + 0
        //     // 65 -> 문자로 변환 (char)65
        //     arr[i] = (char)(65 + i);
        //     System.out.print(arr[i] + " ");
        // }

        // 문제 9번. 8번 문제를 거꾸로 출력하기. [다시해보기]
        // char[] arr = new char[26];

        // for(int i=0; i<=arr.length; i--) {
        //     // 문자를 아스키코드 숫자로 변환
        //     // 'A' -> 아스키코드 65
        //     // 'A' -> 아스키코드 'A' + 0
        //     // 65 -> 문자로 변환 (char)65
        //     arr[i] = (char)(90 - i);
        //     System.out.print(arr[i] + " ");
        // }
    }
}

    

