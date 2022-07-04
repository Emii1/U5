package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class OnlineCourseTest {


    @Test
    public void testSetOnlineCourseUrlWithValidUrl() throws MalformedURLException {
        OnlineCourse onlineCourse = new OnlineCourse("Sth");
        String url = "https://open.spotify.com";
        onlineCourse.setUrl("https://open.spotify.com");
        java.net.URL url1 = new java.net.URL(url);
        Assertions.assertEquals(url1, onlineCourse.getUrl());

    }

    @Test
    public void testSetOnlineCourseUrlWithInvalidUrl() {
        OnlineCourse onlineCourse = new OnlineCourse("Sth");
        Assertions.assertThrows(MalformedURLException.class, () -> onlineCourse.setUrl("Wrong "));
    }

}
