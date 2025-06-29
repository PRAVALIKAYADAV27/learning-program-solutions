package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject into service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Step 4: Assert result
        assertEquals("Mock Data", result);

        // Optional verification
        verify(mockApi, times(1)).getData();
    }
}
