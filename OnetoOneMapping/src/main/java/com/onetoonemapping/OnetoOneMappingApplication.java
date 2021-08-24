package com.onetoonemapping;

import com.onetoonemapping.SharedPrimaryBidirect.Model.SBIDCard;
import com.onetoonemapping.SharedPrimaryBidirect.Model.SBPerson;
import com.onetoonemapping.SharedPrimaryBidirect.Repository.SBPersonRepository;
import com.onetoonemapping.SharedPrimaryUnidirect.Model.SUIDCard;
import com.onetoonemapping.SharedPrimaryUnidirect.Model.SUPerson;
import com.onetoonemapping.SharedPrimaryUnidirect.Repository.SUIDCardRepository;
import com.onetoonemapping.SharedPrimaryUnidirect.Repository.SUPersonRepository;
import com.onetoonemapping.Unidirectional.Model.UIDCard;
import com.onetoonemapping.Unidirectional.Model.UPerson;
import com.onetoonemapping.Unidirectional.Repository.UPersonRepository;
import com.onetoonemapping.bidirectional.Model.BIDCard;
import com.onetoonemapping.bidirectional.Model.BPerson;
import com.onetoonemapping.bidirectional.Repository.BPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnetoOneMappingApplication implements CommandLineRunner {

    @Autowired
    private BPersonRepository BPersonRepository;

    @Autowired
    private UPersonRepository uPersonRepository;

    @Autowired
    private SBPersonRepository sbPersonRepository;

    @Autowired
    private SUIDCardRepository suidCardRepository;

    public static void main(String[] args) {
        SpringApplication.run(OnetoOneMappingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Bidirectional
        BPerson BPerson =new BPerson("tom",new BIDCard());
        this.BPersonRepository.save(BPerson);

        //Unidirectional
        UPerson Uperson=new UPerson("Harry",new UIDCard());
        this.uPersonRepository.save(Uperson);

        //shared primary key bidirectional
        SBPerson sbPerson=new SBPerson("Bob",new SBIDCard());
        this.sbPersonRepository.save(sbPerson);

        //shared primary key unidirectional
        SUPerson suPerson=new SUPerson("Alex");
        SUIDCard suidCard=new SUIDCard(suPerson);
        this.suidCardRepository.save(suidCard);
    }
}
