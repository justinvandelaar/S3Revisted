package Controllers.Location;

import Models.Choice;
import Models.Location;

import org.jboss.resteasy.spi.NotImplementedYetException;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/Location")
@Produces(MediaType.APPLICATION_JSON)
public class LocationResource {

    @GET
    @Path("{locationId}")
    public Location getLocationById(int locationId) {
        throw new NotImplementedYetException();
    }

    @PUT
    @Path("UpdateUser/{locationId}")
    public Location updateUserLocation(int userId, int locationId) {
        throw new NotImplementedYetException();
    }

    @PUT
    @Path("UpdateLocation/?locationId={locationId}&locationTitle={locationTitle}&locationImgLink={locationImgLink}&locationStory={locationStory}")
    public Location updateLocation(int locationId, String locationTitle, String locationImgLink,
                                   String locationStory) {
        throw new NotImplementedYetException();
    }

    @POST
    @Path("Add/?locationTitle={locationTitle}&locationImgLink={locationImgLink}&locationStory={locationStory}")
    public String addLocation(String locationTitle, String locationImgLink, String locationStory) {
        throw new NotImplementedYetException();
    }

    @DELETE
    @Path("Delete/{locationId}")
    public String deleteLocation(int locationId) {
        throw new NotImplementedYetException();
    }

    @GET
    @Path("GetLocationChoies/{locationId}")
    public List<Choice> getLocationChoices(int locationId) {
        throw new NotImplementedYetException();
    }
}
