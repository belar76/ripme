package com.rarchives.ripme.ripper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public interface RipperInterface {
    public void rip() throws IOException;
    public boolean canRip(URL url);
    public URL sanitizeURL(URL url) throws MalformedURLException;
    public void setWorkingDir(URL url) throws IOException;
    public String getHost();
    public String getGID(URL url) throws MalformedURLException;
}
