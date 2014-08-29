package com.opentext.ix.ea.demo.swagger.jersey;

import java.util.UUID;

import javax.swing.text.Document;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.opentext.ix.ea.demo.model.Department;
import com.opentext.ix.ea.demo.model.DepartmentCollection;
import com.opentext.ix.ea.demo.model.ErrorResponse;
import com.opentext.ix.ea.demo.services.DepartmentService;
import com.opentext.ix.ea.demo.services.DepartmentServiceImpl;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("departments")
@Api(value = "/departments", description = "Operations about Departments")
public class DepartmentResource {
	
	private DepartmentService departmentService = new DepartmentServiceImpl();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get All Departments", notes = "More notes about this method", response = DepartmentCollection.class)
    @ApiResponses(value= {
    		@ApiResponse(code=200, response=DepartmentCollection.class, message="OK"),
    		@ApiResponse(code=500, message="Internal Server Error", response=ErrorResponse.class)
    })
    public DepartmentCollection getAllDepartments()
    {
        DepartmentCollection collection = new DepartmentCollection();
        collection.getListOfDepartments().addAll(departmentService.getAllDepartments());
        return collection;
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{departmentId}")
    @ApiOperation(value = "Get Department by Id", notes = "More notes about this method", response = Department.class)
    @ApiResponses(value= {
    		@ApiResponse(code=200, response=Department.class, message="OK"),
    		@ApiResponse(code=404, message="Department Not Found", response=ErrorResponse.class),
    		@ApiResponse(code=500, message="Internal Server Error", response=ErrorResponse.class)
    })
   
    public Department getSingleDepartmentById(@PathParam("departmentId") int departmentId) throws WebApplicationException
    {
    	Department dept = departmentService.getDepartmentByid(departmentId);

    	if(dept == null)
    	{
    		ErrorResponse errorResponse =new ErrorResponse(UUID.randomUUID().toString(), "DEPT-404", "Department Not Found", null);
    		throw new WebApplicationException(Response.status(404).entity(errorResponse).build());
    	}
    	
    	return dept;
    }

}
