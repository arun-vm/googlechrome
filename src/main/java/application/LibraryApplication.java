package application;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;
import resource.CrudResource;

public class LibraryApplication extends Application<LibraryConfiguration> {

    public static void main(String[] args) throws  Exception {
        LibraryApplication obj = new LibraryApplication();
        obj.run(args);
    }

    public void run(LibraryConfiguration libraryConfiguration, Environment environment) throws Exception {
        environment.jersey().register(new CrudResource());
    }
}
