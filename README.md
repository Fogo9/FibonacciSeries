# **FIBONACCI SERIES**

## INFORMATION

* **Program to find fibonacci series with for loop.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* The variables **i**, **n**, **a**, **b** and **c** are defined with int.

* Scanner class is defined to receive data from the user.

## CODES

```Java

        import java.util.Scanner;

        public class fibonacci{

            public static void main(String[] args) {

                int a = 0, b = 1, c;

                Scanner inp = new Scanner (System.in);

                System.out.print("Enter The Number : ");

                int n = inp.nextInt();

                System.out.print(a + " " + b + " ");


```

```Java

                for (int i = 2; i <= n; i++) {

                    c = b + a;

                    System.out.print(c + " ");

                    a = b;

                    b = c;
                }
            }
        }

```

```bash

    Enter The Number : 9
    0 1 1 2 3 5 8 13 21 34

```

<br />

## LINK

* Click here https://github.com/Fogo9/FibonacciSeries.git to access the Github page for this project.

<br />

## LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
