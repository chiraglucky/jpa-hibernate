package com.manytomany;

import com.manytomany.JoinedEntity.bidirectional.compositeprimary.Entity.BSCBook;
import com.manytomany.JoinedEntity.bidirectional.compositeprimary.Entity.BSCBookPublisher;
import com.manytomany.JoinedEntity.bidirectional.compositeprimary.Entity.BSCPublisher;
import com.manytomany.JoinedEntity.bidirectional.compositeprimary.Repository.BSCBookPublisherRepository;
import com.manytomany.JoinedEntity.bidirectional.singleprimary.Repository.BSPBookPublisherRepository;
import com.manytomany.JoinedEntity.unidirectional.compositeprimary.Entity.USCBook;
import com.manytomany.JoinedEntity.unidirectional.compositeprimary.Entity.USCBookPublisher;
import com.manytomany.JoinedEntity.unidirectional.compositeprimary.Entity.USCPublisher;
import com.manytomany.JoinedEntity.unidirectional.compositeprimary.Repository.USCBookPublisherRepository;
import com.manytomany.JoinedEntity.unidirectional.singleprimary.Repository.USPBookPublisherRepository;
import com.manytomany.WithoutJoinedEntity.bidirectional.Entity.BWJBook;
import com.manytomany.WithoutJoinedEntity.bidirectional.Entity.BWJPublisher;
import com.manytomany.WithoutJoinedEntity.bidirectional.Repository.BWJBookRepository;
import com.manytomany.WithoutJoinedEntity.bidirectional.Repository.BWJPublisherRepository;
import com.manytomany.WithoutJoinedEntity.unidirectional.Entity.SWJBook;
import com.manytomany.WithoutJoinedEntity.unidirectional.Entity.SWJPublisher;
import com.manytomany.WithoutJoinedEntity.unidirectional.Repository.SWJBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ManyToManyApplication implements CommandLineRunner {

    @Autowired
    private USPBookPublisherRepository uspBookPublisherRepository;

    @Autowired
    private BSPBookPublisherRepository bspBookPublisherRepository;


    @Autowired
    private USCBookPublisherRepository uscBookPublisherRepository;

    @Autowired
    private BSCBookPublisherRepository bscBookPublisherRepository;

    @Autowired
    private BWJBookRepository bwjBookRepository;

    @Autowired
    private SWJBookRepository swjBookRepository;


    public static void main(String[] args) {
        SpringApplication.run(ManyToManyApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        //Joined Entity
        //Single Primary Key , Unidirectional
//        USPBookPublisher uspBookPublisher=new USPBookPublisher(
//                new Date(),new USPBook("Biology"),new USPPublisher("Marcus Co.")
//        );
//        this.uspBookPublisherRepository.save(uspBookPublisher);
//
        //Joined Entity
        //Single Primary key ,Bidirectional
//        BSPBookPublisher bspBookPublisher=new BSPBookPublisher(
//                new Date(),new BSPBook("Geographic"),new BSPPublisher("Acian Co.")
//        );
//        this.bspBookPublisherRepository.save(bspBookPublisher);

        //Joined Entity
        //Composite key ,Unidirectional
//        USCBookPublisher uscBookPublisher=new USCBookPublisher(
//                new Date(),new USCBook("Architecture"),new USCPublisher("Brian Co.")
//        );
//        this.uscBookPublisherRepository.save(uscBookPublisher);


        //Joined Entity
        //Composite key ,Bidirectional
//        BSCBookPublisher bscBookPublisher=new BSCBookPublisher(
//                new Date(),new BSCBook("Agriculture"),new BSCPublisher("K.A Co.")
//        );
//        this.bscBookPublisherRepository.save(bscBookPublisher);


        //Without Joined Entity
        //Bidirectional
//        Set<BWJPublisher> bwjPublishers=new HashSet<>();
//        bwjPublishers.add(new BWJPublisher("Raj and Co."));
//        bwjPublishers.add(new BWJPublisher("Mehta Column"));
//        BWJBook bwjBook=new BWJBook("TMKOC",bwjPublishers);
//        this.bwjBookRepository.save(bwjBook);

        //without Joined Entity
        //Unidirectional
        Set<SWJPublisher> swjPublishers=new HashSet<>();
        swjPublishers.add(new SWJPublisher("Raj and Co."));
        swjPublishers.add(new SWJPublisher("Mehta Column"));
       SWJBook swjBook=new SWJBook("TMKOC",swjPublishers);
        this.swjBookRepository.save(swjBook);
    }
}
