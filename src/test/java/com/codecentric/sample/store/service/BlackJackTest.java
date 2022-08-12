package com.codecentric.sample.store.service;

import com.codecentric.sample.store.model.BlackJack;
import com.codecentric.sample.store.service.tools.StaticService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

public class BlackJackTest {



    @Before
    public void setUp() throws Exception {
        
    }


    @Test
    public void testPlayers_ZeroCase() {
        int[] deck = new int[4];
        char count=0;
        assertEquals(BlackJack.display(deck,count),0);
    }

    @Test
    public void testPlayers_Non_ZeroCase() {
        int[] deck = new int[4];
        char count=5;
        assertEquals(BlackJack.display(deck,count),1);
    }
}



