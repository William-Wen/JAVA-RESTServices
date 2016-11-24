package config;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import service.FoodRestService;

/*@ApplicationPath("rs")
public class ApplicationConfig extends Application{
	private final Set<Class<?>> mClasses;

	public ApplicationConfig() {
		// TODO Auto-generated constructor stub
		HashSet<Class<?>> classes = new HashSet<>();
		classes.add(FoodRestService.class);
		classes.add(MOXyJsonProvider.class);
		mClasses = Collections.unmodifiableSet(classes);
	}

	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return mClasses;
	}
}
*/

/**
 * @author william.wen
 */
@ApplicationPath("rs")
public class ApplicationConfig extends ResourceConfig {

	/**
	 * Constructor: Registers the classes used in the rest application.
	 */
	public ApplicationConfig() {
		super(FoodRestService.class);
		// TODO Auto-generated constructor stub
		this.packages("service");
		this.register(MOXyJsonProvider.class);
		this.register(RolesAllowedDynamicFeature.class);
	}

}
