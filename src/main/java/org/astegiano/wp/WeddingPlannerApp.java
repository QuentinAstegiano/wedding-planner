package org.astegiano.wp;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.astegiano.wp.dao.CircleDao;
import org.astegiano.wp.dao.GuestDao;
import org.astegiano.wp.resources.CircleResource;
import org.astegiano.wp.resources.GuestResource;

/**
 * Created by Quentin on 09/03/2016.
 */
public class WeddingPlannerApp extends Application<WeddingPlannerConf> {

    public static void main(String[] args) throws Exception {
        new WeddingPlannerApp().run(args);
    }

    @Override
    public String getName() {
        return "wedding-planner";
    }

    @Override
    public void initialize(Bootstrap<WeddingPlannerConf> bootstrap) {
    }

    @Override
    public void run(WeddingPlannerConf conf, Environment env) throws Exception {
        env.jersey().register(new GuestResource(new GuestDao()));
        env.jersey().register(new CircleResource(new CircleDao()));
    }
}
