package ro.ase.acs.simplefactory;

import ro.ase.acs.exceptions.NoSuchServerException;

public class RestApiFactoryVersion2 {
    public RestApi getRestApi(ServerType serverType) throws NoSuchServerException {
        if(serverType == ServerType.DEVELOPMENT) {
            return new RestApiDevelopment();
        } else if(serverType == ServerType.PRODUCTION) {
            return new RestApiProduction();
        } else {
            throw new NoSuchServerException();
        }
    }
}
