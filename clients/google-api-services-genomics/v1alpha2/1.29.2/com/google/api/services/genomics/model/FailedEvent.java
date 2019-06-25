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

package com.google.api.services.genomics.model;

/**
 * An event generated when the execution of a pipeline has failed. Note that other events can
 * continue to occur after this event.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FailedEvent extends com.google.api.client.json.GenericJson {

  /**
   * The human-readable description of the cause of the failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cause;

  /**
   * The Google standard error code that best describes this failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * The human-readable description of the cause of the failure.
   * @return value or {@code null} for none
   */
  public java.lang.String getCause() {
    return cause;
  }

  /**
   * The human-readable description of the cause of the failure.
   * @param cause cause or {@code null} for none
   */
  public FailedEvent setCause(java.lang.String cause) {
    this.cause = cause;
    return this;
  }

  /**
   * The Google standard error code that best describes this failure.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * The Google standard error code that best describes this failure.
   * @param code code or {@code null} for none
   */
  public FailedEvent setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  @Override
  public FailedEvent set(String fieldName, Object value) {
    return (FailedEvent) super.set(fieldName, value);
  }

  @Override
  public FailedEvent clone() {
    return (FailedEvent) super.clone();
  }

}
