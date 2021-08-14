// sourcefile name : Main005.java
// "The Java Language Specification Java SE 16 Edition(2021-02-12)"より。
// 1.2 Example Programsで紹介されていた。
// なお、実行時に引数を指定する必要あり。
// >javac Main005.java
// >java Main005 Hello, world.
// (Java SE 11から、javacでコンパイルしなくてもjavaコマンドで直接javaファイルを実行できるようになったはず。)
//

class Main005 {
       public static void main(String[] args) {
           for (int i = 0; i < args.length; i++)
               System.out.print(i == 0 ? args[i] : " " + args[i]);
           System.out.println();
       }
}

// 以下、原文。
//
//
// 1.2 Example Programs
//
// Most of the example programs given in the text are ready to be executed and are similar in form to:
//	   class Test {
//	       public static void main(String[] args) {
//	           for (int i = 0; i < args.length; i++)
//	               System.out.print(i == 0 ? args[i] : " " + args[i]);
//	           System.out.println();
//	       }
//	}
//	On a machine with the Oracle JDK installed, this class, stored in the file Test.java,
//	can be compiled and executed by giving the commands:
//	   javac Test.java
//	   java Test Hello, world.
//	producing the output:
//	   Hello, world.