package guru.springframework.spring5webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repository.BookRepository;

@Controller
public class BookController {

	
	
	private BookRepository bookRepository;

	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	
      @RequestMapping(value="/books")
	  public String getBooks(Model model)
	  {
    	  model.addAttribute("books",bookRepository.findAll());
    	  return "books" ;
	  }
	
	
}
