package com.fastcampus.javaallinone.project3.mycontact.repository;

import com.fastcampus.javaallinone.project3.mycontact.domain.Block;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BlockRepositoryTest {
    @Autowired
    private BlockRepository blockRepository;
    @Test
    void crud() {
        Block block = new Block();
        block.setName("dkk");
        block.setReason("안친함");
        block.setStartDate(LocalDate.now());
        block.setEndDate(LocalDate.now());
        
        blockRepository.save(block);
        
        List<Block> blocks = blockRepository.findAll();

        assertThat(((List) blocks).size()).isEqualTo(1);
        assertThat(blocks.get(0).getName()).isEqualTo("dkk"); 
    }
}