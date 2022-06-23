/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.securitycenter.v1.samples;

// [START securitycenter_v1_generated_securitycenterclient_getbigqueryexport_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.securitycenter.v1.BigQueryExport;
import com.google.cloud.securitycenter.v1.BigQueryExportName;
import com.google.cloud.securitycenter.v1.GetBigQueryExportRequest;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;

public class AsyncGetBigQueryExport {

  public static void main(String[] args) throws Exception {
    asyncGetBigQueryExport();
  }

  public static void asyncGetBigQueryExport() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
      GetBigQueryExportRequest request =
          GetBigQueryExportRequest.newBuilder()
              .setName(
                  BigQueryExportName.ofOrganizationExportName("[ORGANIZATION]", "[EXPORT]")
                      .toString())
              .build();
      ApiFuture<BigQueryExport> future =
          securityCenterClient.getBigQueryExportCallable().futureCall(request);
      // Do something.
      BigQueryExport response = future.get();
    }
  }
}
// [END securitycenter_v1_generated_securitycenterclient_getbigqueryexport_async]
