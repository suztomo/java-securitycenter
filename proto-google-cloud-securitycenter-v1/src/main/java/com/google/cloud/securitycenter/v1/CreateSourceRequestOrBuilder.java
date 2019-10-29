/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

public interface CreateSourceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.CreateSourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the new source's parent. Its format should be
   * "organizations/[organization_id]".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Resource name of the new source's parent. Its format should be
   * "organizations/[organization_id]".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The Source being created, only the display_name and description will be
   * used. All other fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Source source = 2;</code>
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * The Source being created, only the display_name and description will be
   * used. All other fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Source source = 2;</code>
   */
  com.google.cloud.securitycenter.v1.Source getSource();
  /**
   *
   *
   * <pre>
   * The Source being created, only the display_name and description will be
   * used. All other fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Source source = 2;</code>
   */
  com.google.cloud.securitycenter.v1.SourceOrBuilder getSourceOrBuilder();
}
