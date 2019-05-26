package application;

import io.dropwizard.Configuration;

public class LibraryConfiguration extends Configuration {
 private   long port;
  private  long adminPort;

    public long getPort() {
        return port;
    }

    public void setPort(long port) {
        this.port = port;
    }

    public long getAdminPort() {
        return adminPort;
    }

    public void setAdminPort(long adminPort) {
        this.adminPort = adminPort;
    }
}
