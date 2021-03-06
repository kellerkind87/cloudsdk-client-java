// Copyright © 2019 ABBYY Production LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package abbyy.cloudsdk.v2.client.models;

/**
 * Connection configuration info
 */
public final class AuthInfo {
    /**
     * OCR SDK Host
     */
    private String host;

    /**
     * Application Id
     */
    private String applicationId;

    /**
     * Password
     */
    private String password;

    public AuthInfo(String host, String applicationId, String password) {
        this.host = host;
        this.applicationId = applicationId;
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getPassword() {
        return password;
    }

}
