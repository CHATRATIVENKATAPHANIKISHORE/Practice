package com.mocktest.MockUnit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import com.mocktest.MockUnit.Model.Book;
import com.mocktest.MockUnit.Repository.BookRepository;
import com.mocktest.MockUnit.Service.BookService;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MockUnitApplicationTests {
	@Mock
	BookRepository bookRepo;
	
	@InjectMocks
	BookService bs;
	
	
	@Test
	void contextLoads() {
		
	}
	@Test
	void mocktestOne() {
		assertEquals(null,null);
	}

	@SuppressWarnings("deprecation")
	@Test
	void mockbookTest() {
		assertEquals(null,null);
	}
	@Test
	void mockbookRepOne() {
		Book bookOne = new Book((long)1, "sam",  LocalDate.now().toString(), "Kishore", 2000.0);
		Book bookTwo = new Book((long)2, "ram",  LocalDate.now().toString(), "Phani", 90.0);
		when(bookRepo.findBookById((long) 1)).thenReturn( bookOne);
		when(bookRepo.findBookById((long) 2)).thenReturn( bookTwo);
		List<Long> bid = new ArrayList<>();
		bid.add((long)1);
		bid.add((long)2);
		Double ac = bs.calcCost(bid);
		assertEquals((Object)2090.0, (Object)ac);
		

	}


}
