package com.student.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class StudentApplicationTests {

	private final List<Student> studentDataPreparation = new ArrayList<>();
	private final Solution solution = new Solution();

	// TDD

	// identification

	// Case 1 // many variant
	// student -> A, B, C, D, E, F => if sequence => A > B > C > D > E > F | ans => A, B, C
	// Case 2
	// student -> null => ignore / skip -> result is not counted
	// case 3
	// Grade -> null => ignore / skip -> result is not counted
	// Case 4
	// student ->  unexpected grade G => ignore/ skip -> result is not counter

	//case 1
	@Test
	void positiveTest() {
		studentDataPreparation.clear();
		studentDataPreparation.add(new Student("Saiful Islam", Optional.of(new Grade("D"))));
		studentDataPreparation.add(new Student("Mahmud Hasan", Optional.of(new Grade("A"))));
		studentDataPreparation.add(new Student("Nabil", Optional.of(new Grade("B"))));
		studentDataPreparation.add(new Student("Sadia Afrose", Optional.of(new Grade("C"))));
		studentDataPreparation.add(new Student("Russel Bhai", Optional.of(new Grade("F"))));
		studentDataPreparation.add(new Student("Masud bhai", Optional.of(new Grade("E"))));
		studentDataPreparation.add(new Student("Shyfuzzaman bhai", Optional.of(new Grade("A"))));
		studentDataPreparation.add(new Student("Joytee dada", Optional.of(new Grade("B"))));
		studentDataPreparation.add(new Student("Ponir Dada", Optional.of(new Grade("F"))));

		List<String> expectedResult = Arrays.asList( "Mahmud Hasan","Nabil", "Sadia Afrose", "Shyfuzzaman bhai", "Joytee dada");
		List<String> actualResult = solution.getStudentsAboveGrade(studentDataPreparation);
		Assertions.assertEquals(expectedResult, actualResult);
	}


	@Test
	void duplicationTest() {
		studentDataPreparation.clear();
		studentDataPreparation.add(new Student("Saiful Islam", Optional.of(new Grade("D"))));
		studentDataPreparation.add(new Student("Mahmud Hasan", Optional.of(new Grade("A"))));
		studentDataPreparation.add(new Student("Mahmud Hasan", Optional.of(new Grade("A"))));
		studentDataPreparation.add(new Student("Mahmud Hasan", Optional.of(new Grade("A"))));
		studentDataPreparation.add(new Student("Nabil", Optional.of(new Grade("B"))));
		studentDataPreparation.add(new Student("Sadia Afrose", Optional.of(new Grade("C"))));
		studentDataPreparation.add(new Student("Sadia Afrose", Optional.of(new Grade("C"))));
		studentDataPreparation.add(new Student("Russel Bhai", Optional.of(new Grade("F"))));
		studentDataPreparation.add(new Student("Masud bhai", Optional.of(new Grade("E"))));
		studentDataPreparation.add(new Student("Shyfuzzaman bhai", Optional.of(new Grade("A"))));
		studentDataPreparation.add(new Student("Joytee dada", Optional.of(new Grade("B"))));
		studentDataPreparation.add(new Student("Ponir Dada", Optional.of(new Grade("F"))));

		List<String> expectedResult = Arrays.asList( "Mahmud Hasan","Nabil", "Sadia Afrose", "Shyfuzzaman bhai", "Joytee dada");
		List<String> actualResult = solution.getStudentsAboveGrade(studentDataPreparation);
		Assertions.assertEquals(expectedResult, actualResult);
	}


	@Test
	void negativeContainNullTest() {
		studentDataPreparation.clear();
		studentDataPreparation.add(new Student("Saiful Islam", Optional.of(new Grade("D"))));
		studentDataPreparation.add(null);
		studentDataPreparation.add(new Student("Mahmud Hasan", Optional.of(new Grade("A"))));
		studentDataPreparation.add(new Student("Nabil", Optional.of(new Grade("B"))));
		studentDataPreparation.add(null);
		studentDataPreparation.add(new Student("Sadia Afrose", Optional.of(new Grade("C"))));
		studentDataPreparation.add(new Student("Russel Bhai", Optional.of(new Grade("F"))));
		studentDataPreparation.add(new Student("Masud bhai", Optional.of(new Grade("E"))));
		studentDataPreparation.add(null);
		studentDataPreparation.add(new Student("Shyfuzzaman bhai", Optional.of(new Grade("A"))));
		studentDataPreparation.add(new Student("Joytee dada", Optional.of(new Grade("B"))));
		studentDataPreparation.add(new Student("Ponir Dada", Optional.of(new Grade("F"))));
		studentDataPreparation.add(null);

		List<String> expectedResult = Arrays.asList( "Mahmud Hasan","Nabil", "Sadia Afrose", "Shyfuzzaman bhai", "Joytee dada");

		List<String> actualResult = solution.getStudentsAboveGrade(studentDataPreparation);
		Assertions.assertEquals(expectedResult, actualResult);
	}

	@Test
	void negativeContainNullGradeTest() {
		studentDataPreparation.clear();
		studentDataPreparation.add(new Student("Saiful Islam", Optional.of(new Grade("D"))));
		studentDataPreparation.add(new Student("Mahmud Hasan", Optional.of(new Grade("A"))));
		studentDataPreparation.add(new Student("Nabil", Optional.of(new Grade("B"))));
		studentDataPreparation.add(new Student("Sadia Afrose", Optional.of(new Grade("C"))));
		studentDataPreparation.add(new Student("Russel Bhai", Optional.of(new Grade("F"))));
		studentDataPreparation.add(new Student("Masud bhai", Optional.of(new Grade("E"))));
		studentDataPreparation.add(new Student("Shyfuzzaman bhai", Optional.of(new Grade("A"))));
		studentDataPreparation.add(new Student("Joytee dada", Optional.of(new Grade("B"))));
		studentDataPreparation.add(new Student("Ponir Dada", Optional.of(new Grade("F"))));
		// null case
		studentDataPreparation.add(new Student("Rahul Dada", Optional.ofNullable(null)));
		studentDataPreparation.add(new Student("Sarawer bhai", null));
		studentDataPreparation.add(new Student("Hafiz bhai", Optional.ofNullable(new Grade(null))));


		studentDataPreparation.add(null);

		List<String> expectedResult = Arrays.asList( "Mahmud Hasan","Nabil", "Sadia Afrose", "Shyfuzzaman bhai", "Joytee dada");

		List<String> actualResult = solution.getStudentsAboveGrade(studentDataPreparation);
		Assertions.assertEquals(expectedResult, actualResult);
	}


	@Test
	void negativeUnexpectedGradeTest() {
		studentDataPreparation.clear();
		studentDataPreparation.add(new Student("Saiful Islam", Optional.of(new Grade("D"))));
		studentDataPreparation.add(new Student("Mahmud Hasan", Optional.of(new Grade("A"))));
		studentDataPreparation.add(new Student("Nabil", Optional.of(new Grade("B"))));
		studentDataPreparation.add(new Student("Sadia Afrose", Optional.of(new Grade("C"))));
		studentDataPreparation.add(new Student("Russel Bhai", Optional.of(new Grade("F"))));
		studentDataPreparation.add(new Student("Masud bhai", Optional.of(new Grade("E"))));
		studentDataPreparation.add(new Student("Shyfuzzaman bhai", Optional.of(new Grade("A"))));
		studentDataPreparation.add(new Student("Joytee dada", Optional.of(new Grade("B"))));
		studentDataPreparation.add(new Student("Ponir Dada", Optional.of(new Grade("F"))));
		// case 4
		studentDataPreparation.add(new Student("Rahul Dada", Optional.of(new Grade("P"))));
		studentDataPreparation.add(new Student("Sarawer bhai", Optional.of(new Grade("H"))));
		studentDataPreparation.add(new Student("Hafiz bhai", Optional.of(new Grade("K"))));


		studentDataPreparation.add(null);

		List<String> expectedResult = Arrays.asList( "Mahmud Hasan","Nabil", "Sadia Afrose", "Shyfuzzaman bhai", "Joytee dada");

		List<String> actualResult = solution.getStudentsAboveGrade(studentDataPreparation);
		Assertions.assertEquals(expectedResult, actualResult);
	}

}
