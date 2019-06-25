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

package com.google.api.services.genomics.v2alpha1.model;

/**
 * Carries information about an accelerator that can be attached to a VM.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Accelerator extends com.google.api.client.json.GenericJson {

  /**
   * How many accelerators of this type to attach.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long count;

  /**
   * The accelerator type string (for example, "nvidia-tesla-k80").
   *
   * Only NVIDIA GPU accelerators are currently supported. If an NVIDIA GPU is attached, the
   * required runtime libraries will be made available to all containers under `/usr/local/nvidia`.
   * The driver version to install must be specified using the NVIDIA driver version parameter on
   * the virtual machine specification. Note that attaching a GPU increases the worker VM startup
   * time by a few minutes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * How many accelerators of this type to attach.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * How many accelerators of this type to attach.
   * @param count count or {@code null} for none
   */
  public Accelerator setCount(java.lang.Long count) {
    this.count = count;
    return this;
  }

  /**
   * The accelerator type string (for example, "nvidia-tesla-k80").
   *
   * Only NVIDIA GPU accelerators are currently supported. If an NVIDIA GPU is attached, the
   * required runtime libraries will be made available to all containers under `/usr/local/nvidia`.
   * The driver version to install must be specified using the NVIDIA driver version parameter on
   * the virtual machine specification. Note that attaching a GPU increases the worker VM startup
   * time by a few minutes.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The accelerator type string (for example, "nvidia-tesla-k80").
   *
   * Only NVIDIA GPU accelerators are currently supported. If an NVIDIA GPU is attached, the
   * required runtime libraries will be made available to all containers under `/usr/local/nvidia`.
   * The driver version to install must be specified using the NVIDIA driver version parameter on
   * the virtual machine specification. Note that attaching a GPU increases the worker VM startup
   * time by a few minutes.
   * @param type type or {@code null} for none
   */
  public Accelerator setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Accelerator set(String fieldName, Object value) {
    return (Accelerator) super.set(fieldName, value);
  }

  @Override
  public Accelerator clone() {
    return (Accelerator) super.clone();
  }

}
