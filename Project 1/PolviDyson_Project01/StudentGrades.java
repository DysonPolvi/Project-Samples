package PolviDyson_Project01;

import java.util.Scanner;

public class StudentGrades {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int ARRAY_LENGTH = 5; 
    final int GRADES_LENGTH = 8;
    final int NAMES_LENGTH = 2;

    double[][] grades = {
      { 3.83, 9.21, 9.25, 0.84, 1.40, 7.90, 1.41, 5.15 },
      { 5.09, 3.66, 3.04, 3.02, 8.59, 2.34, 8.86, 7.40 },
      { 5.35, 0.85, 8.56, 7.37, 2.78, 3.19, 2.04, 5.70 },
      { 9.25, 9.62, 7.08, 7.27, 9.86, 5.88, 9.86, 9.70 },
      { 3.39, 2.75, 1.23, 1.04, 3.87, 8.72, 4.60, 6.21 }
      };

    String[][] userNames = arrayNames(scanner, ARRAY_LENGTH, NAMES_LENGTH);
    double[] studentAverage = studentAverageMethod(grades, ARRAY_LENGTH, GRADES_LENGTH);
    printerMethod(userNames, studentAverage);
    System.out.println("-------------------------------");
    double classAverage = classAverageMethod(studentAverage, ARRAY_LENGTH);
    System.out.printf("%.2f" , classAverage);
    scanner.close();

  }

  //collects the first and last names, stores them into an array
  public static String[][] arrayNames(Scanner scanner, int ARRAY_LENGTH, int NAMES_LENGTH) {
    String[][] userNames = new String[ARRAY_LENGTH][NAMES_LENGTH];
      for (int i = 0; i < ARRAY_LENGTH; i++) {
        for (int j = 0; j < 2; j++) {
      System.out.println("Please enter last name number " + (i+1));
      String userLastName = scanner.next();
      userNames[i][j] = userLastName; 
      j++;
      System.out.println("Please enter first name number " + (i+1));
      String userFirstName = scanner.next();
      userNames[i][j] = userFirstName;
      }
    }
      return userNames;
    }

    //calculates the average grade of each student
    public static double[] studentAverageMethod(double[][] grades, int ARRAY_LENGTH, int GRADES_LENGTH) {
      double studentTempAverage = 0.0;
      for (int i = 0; i < ARRAY_LENGTH; i++) {
        for (int j = 0; j < GRADES_LENGTH; j++)
        studentTempAverage += grades[i][j]; 
      }
      studentTempAverage = 0.0;
        int k = 0;
        double[] studentAverage = new double[ARRAY_LENGTH];        
        for (double[] i: grades) {
          for (double j: i) {
            studentTempAverage += j;
          }
          studentAverage[k] = (studentTempAverage / GRADES_LENGTH);
          studentTempAverage = 0.0;
          k++;
        }
       return studentAverage;      
      }

      //calculates the class-average
      public static double classAverageMethod(double[] studentAverage, int ARRAY_LENGTH) {
        double classTempAverage = 0.0;
        for (double i: studentAverage) {
          classTempAverage += i;
        }
       double classAverage = (classTempAverage / ARRAY_LENGTH);
       System.out.printf("Class average: ");
      return classAverage;
      }

    //prints the student name, followed by their grade average
    public static void printerMethod(String[][] userNames, double[] studentAverage) {
      System.out.println("Student GPAs:");
      for (int i = 0; i < studentAverage.length; i++) {
       for (int k = userNames[0].length-1; k >= 0; k--) {
        System.out.print(userNames[i][k] + " ");
       }
       System.out.printf(": %.2f \n" , studentAverage[i]);
    }
    }
  }