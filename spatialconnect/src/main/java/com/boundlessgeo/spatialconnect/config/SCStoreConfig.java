/*
 *
 *  * ****************************************************************************
 *  *  Licensed to the Apache Software Foundation (ASF) under one
 *  *  or more contributor license agreements.  See the NOTICE file
 *  *  distributed with this work for additional information
 *  *  regarding copyright ownership.  The ASF licenses this file
 *  *  to you under the Apache License, Version 2.0 (the
 *  *  "License"); you may not use this file except in compliance
 *  *  with the License.  You may obtain a copy of the License at
 *  *
 *  *    http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing,
 *  *  software distributed under the License is distributed on an
 *  *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  *  KIND, either express or implied.  See the License for the
 *  *  specific language governing permissions and limitations
 *  *  under the License.
 *  * ****************************************************************************
 *
 */

package com.boundlessgeo.spatialconnect.config;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a JSON object in the scconfig.json file describing a store.
 */
public class SCStoreConfig
{
    /**
     * The store's type.  geopackage, geojson, WMS, etc
     */
    private String type;

    /**
     * The version of the type. For example, 1.1.0 could be a valid version for the WMS type.
     */
    private String version;

    /**
     * Indicates whether the store is packaged within the APK itself.
     */
    private boolean isInApp;

    /**
     * The URI to the store.  Could be a file path or an HTTP(S) URL
     */
    private String uri;

    /**
     * Unique id of the store.
     */
    @JsonProperty("id")
    private String uniqueID;

    /**
     * Descriptive name for the store used in the UI display.  Can't have a period (.)
     */
    private String name;

    public SCStoreConfig() {}

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getVersion()
    {
        return (version != null) ? version : "1";
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public boolean isInApp() { return isInApp; }

    public void setIsInApp(boolean isInApp) { this.isInApp = isInApp; }

    public String getUri()
    {
        return uri;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

    public String getUniqueID()
    {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID)
    {
        this.uniqueID = uniqueID;
    }

    public String getName()
    {
        return name;
    }

    /** Cant have a period **/
    public void setName(String name)
    {
        this.name = name;
    }
}
