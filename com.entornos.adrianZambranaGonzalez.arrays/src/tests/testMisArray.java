package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.entornos.adrianZambranaGonzalez.arrays.MisArrays;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class testMisArray {

	int[] array1;
	int[] array2;
	int[] array3;
	@BeforeAll
	void inicializar() {
		array1 = new int[] {1,2,3,5};
		array2 = new int[] {1,2,3,5,8};
		array3 = new int[] {9,5,7,6,1,2,7,6};
	}
	@Test
	void testMedia() {
		assertEquals(MisArrays.media(array1),2.75);
		assertEquals(MisArrays.media(array2),3.8);
		assertEquals(MisArrays.media(array3),5.375);
	}

}