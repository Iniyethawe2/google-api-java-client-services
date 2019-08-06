/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudasset.v1.model;

/**
 * `AccessPolicy` is a container for `AccessLevels` (which define the necessary attributes to use
 * GCP services) and `ServicePerimeters` (which define regions of services able to freely pass data
 * within a perimeter). An access policy is globally visible within an organization, and the
 * restrictions it specifies apply to all projects within an organization.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleIdentityAccesscontextmanagerV1AccessPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Time the `AccessPolicy` was created in UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Resource name of the `AccessPolicy`. Format: `accessPolicies/{policy_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The parent of this `AccessPolicy` in the Cloud Resource Hierarchy. Currently
   * immutable once created. Format: `organizations/{organization_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Required. Human readable title. Does not affect behavior.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Output only. Time the `AccessPolicy` was updated in UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Time the `AccessPolicy` was created in UTC.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time the `AccessPolicy` was created in UTC.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1AccessPolicy setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Resource name of the `AccessPolicy`. Format: `accessPolicies/{policy_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the `AccessPolicy`. Format: `accessPolicies/{policy_id}`
   * @param name name or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1AccessPolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The parent of this `AccessPolicy` in the Cloud Resource Hierarchy. Currently
   * immutable once created. Format: `organizations/{organization_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Required. The parent of this `AccessPolicy` in the Cloud Resource Hierarchy. Currently
   * immutable once created. Format: `organizations/{organization_id}`
   * @param parent parent or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1AccessPolicy setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Required. Human readable title. Does not affect behavior.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Required. Human readable title. Does not affect behavior.
   * @param title title or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1AccessPolicy setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Output only. Time the `AccessPolicy` was updated in UTC.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time the `AccessPolicy` was updated in UTC.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1AccessPolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1AccessPolicy set(String fieldName, Object value) {
    return (GoogleIdentityAccesscontextmanagerV1AccessPolicy) super.set(fieldName, value);
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1AccessPolicy clone() {
    return (GoogleIdentityAccesscontextmanagerV1AccessPolicy) super.clone();
  }

}
