package org.astegiano.wp.resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import org.astegiano.wp.dao.GuestDao;
import org.astegiano.wp.data.Guest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Quentin on 09/03/2016.
 */
@Path("/guest")
@Produces(MediaType.APPLICATION_JSON)
public class GuestResource {

    private final GuestDao dao;

    public GuestResource(GuestDao dao) {
        this.dao = dao;
    }

    @GET
    @Timed
    public List<Guest> getAll(@QueryParam("search") Optional<String> search) {
        return dao.getAllGuests(search);
    }
}
