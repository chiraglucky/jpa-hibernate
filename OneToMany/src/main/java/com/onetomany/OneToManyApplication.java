package com.onetomany;

import com.onetomany.bidirectional.Model.BBook;
import com.onetomany.bidirectional.Model.BBookCategory;
import com.onetomany.bidirectional.Repository.BBookCategoryRepository;
import com.onetomany.bidirectional.Repository.BBookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner {

    @Autowired
    private BBookCategoryRepository bBookCategoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(OneToManyApplication.class, args);
    }


    @Override
    @Transactional
    public void run(String... args) throws Exception {

        //bidirectional
        final BBookCategory bbookCategoryA=new BBookCategory("Category A");
        Set<BBook> bBooks=new HashSet<>();
        bBooks.add(new BBook("maths",bbookCategoryA));
        bBooks.add(new BBook("physics",bbookCategoryA));
        bbookCategoryA.setBooks(bBooks);
        this.bBookCategoryRepository.save(bbookCategoryA);

    }
}
