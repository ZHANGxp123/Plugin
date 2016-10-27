package com.ress.plugin;

import android.content.Intent;

import com.ress.plugin.activity.MainActivity;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Created by ress on 2016/10/27.
 */
public class SimpleBundle implements BundleActivator {
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        bundleContext.getBundleContext().startActivity(new Intent(bundleContext.getBundleContext(),MainActivity.class));
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {

    }
}
