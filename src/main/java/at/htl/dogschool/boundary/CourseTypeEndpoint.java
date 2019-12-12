package at.htl.dogschool.boundary;

import at.htl.dogschool.control.CourseTypeRepository;
import at.htl.dogschool.entity.CourseType;

import javax.inject.Inject;
import javax.persistence.EntityNotFoundException;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

public class CourseTypeEndpoint {


    public List<CourseType> readAll() {
        return null;
    }

    public Response create(CourseType courseType, @Context UriInfo info) {
        return null;
    }

    public Response update(@PathParam("id") long id, CourseType courseType) {
        return null;
    }

    public Response delete(@PathParam("id") long id) {
        return null;
    }


}
