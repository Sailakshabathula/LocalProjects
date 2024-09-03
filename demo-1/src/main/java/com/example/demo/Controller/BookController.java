package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.Book;
import com.example.demo.Repo.BookRepo;

@Controller
public class BookController {
	
	@Autowired
	private BookRepo repo;
	
	@GetMapping("/data")
	public ModelAndView getAll()
	{
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("book",repo.findAll());
		mav.setViewName("index");
		return mav;
	}
	
	 @PostMapping("/savebook")
	 public ModelAndView saveBook(Book book)
	{
		ModelAndView mav=new ModelAndView();
		
		System.out.println(book);
		repo.save(book);
		mav.addObject("book",repo.findAll());
		mav.setViewName("index");
		
		return mav;
	}
    
	@GetMapping("/delete")
	public ModelAndView deleteBook(@RequestParam("bookId") Integer bookId)
	{
		repo.deleteById(bookId);
		ModelAndView mav=new ModelAndView();
		mav.addObject("book",repo.findAll());
		mav.setViewName("index");
		return mav;
	}
	@GetMapping("/edit")
	public ModelAndView editBook(@RequestParam("bookId") Integer bookId)
	{
		Optional<Book> findById = repo.findById(bookId);
		ModelAndView mav=new ModelAndView();
		mav.addObject("book",findById);
		mav.setViewName("addnewbook");
		return mav;
	}
	
	
	@GetMapping("/addnewbook")
	public ModelAndView AddBook()
	{
		ModelAndView mav=new ModelAndView();
		
	   mav.addObject("book",new Book());
		mav.setViewName("addnewbook");
		
		return mav;
	}

}
