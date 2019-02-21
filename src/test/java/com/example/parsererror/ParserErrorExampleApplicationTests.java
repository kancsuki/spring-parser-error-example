package com.example.parsererror;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParserErrorExampleApplicationTests {

    @Autowired
    private ElvenRepository elvenRepository;

    @Test
    public void test() {
        ElfEntity elfEntity1 = new ElfEntity();
        elfEntity1.setUid("elf1");
        elfEntity1.setCharacterName("Legolas");
        elfEntity1.setTownName("Mirkwood");
        elvenRepository.save(elfEntity1);

        ElfEntity elfEntity2 = new ElfEntity();
        elfEntity2.setUid("elf2");
        elfEntity2.setCharacterName("Elrond");
        elfEntity2.setTownName("Rivendell");
        elvenRepository.save(elfEntity2);

        Filter filter = new Filter();
        filter.setTownName("Mirkwood");
        PageRequest pageRequest = PageRequest.of(0, 10, Direction.ASC, "uid");
        Page<ElfProjection> projection = elvenRepository.getProjection(filter, pageRequest);
        Assert.assertEquals(1, projection.getContent().size());
        Assert.assertEquals(elfEntity1.getUid(), projection.getContent().get(0).getUid());
    }

}
