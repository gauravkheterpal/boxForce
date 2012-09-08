// Copyright 2011 Box.net.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package com.metacube.boxforce;

import com.salesforce.androidsdk.rest.RestClient;

public class Constants {

    // IMPORTANT: Set this to your OpenBox API Key. This demo will not work
    // until you do so!!!
    // To get an API Key, go to https://www.box.net/developers
    public static final String API_KEY = "pjgs2dnnmaman7yfpn0avxpic9k89ean	";
    public static RestClient client; 
    public static final String PREFS_FILE_NAME = "prefs";
    public static final String PREFS_KEY_AUTH_TOKEN = "AUTH_TOKEN";
    public static final String ITEM_TYPE_LIST_ITEM = "LIST_ITEM";
}
