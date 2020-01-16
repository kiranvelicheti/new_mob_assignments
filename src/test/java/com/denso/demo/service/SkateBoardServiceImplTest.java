package com.denso.demo.service;

import com.denso.demo.domain.SkateBoard;
import com.denso.demo.repository.SkateBoardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SkateBoardServiceImplTest {

    @InjectMocks
    private SkateBoardServiceImpl classUnderTest;
    @Mock
    private SkateBoardRepository skateBoardRepository;

    @Test
    public void getAllAvailableSkateBoards() {

        List<SkateBoard> actual = classUnderTest.getAllAvailableSkateBoards();

        assertThat(actual).isNull();
        verify(skateBoardRepository).findAll();
    }
}