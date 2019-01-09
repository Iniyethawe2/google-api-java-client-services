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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * Derived describes the derived image portion (Occurrence) of the DockerImage relationship. This
 * image would be produced from a Dockerfile with FROM .
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Derived extends com.google.api.client.json.GenericJson {

  /**
   * Output only. This contains the base image URL for the derived image occurrence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String baseResourceUrl;

  /**
   * Output only. The number of layers by which this image differs from the associated image basis.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer distance;

  /**
   * Required. The fingerprint of the derived image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Fingerprint fingerprint;

  /**
   * This contains layer-specific metadata, if populated it has length "distance" and is ordered
   * with [distance] being the layer immediately following the base image and [1] being the final
   * layer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Layer> layerInfo;

  /**
   * Output only. This contains the base image URL for the derived image occurrence.
   * @return value or {@code null} for none
   */
  public java.lang.String getBaseResourceUrl() {
    return baseResourceUrl;
  }

  /**
   * Output only. This contains the base image URL for the derived image occurrence.
   * @param baseResourceUrl baseResourceUrl or {@code null} for none
   */
  public Derived setBaseResourceUrl(java.lang.String baseResourceUrl) {
    this.baseResourceUrl = baseResourceUrl;
    return this;
  }

  /**
   * Output only. The number of layers by which this image differs from the associated image basis.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDistance() {
    return distance;
  }

  /**
   * Output only. The number of layers by which this image differs from the associated image basis.
   * @param distance distance or {@code null} for none
   */
  public Derived setDistance(java.lang.Integer distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Required. The fingerprint of the derived image.
   * @return value or {@code null} for none
   */
  public Fingerprint getFingerprint() {
    return fingerprint;
  }

  /**
   * Required. The fingerprint of the derived image.
   * @param fingerprint fingerprint or {@code null} for none
   */
  public Derived setFingerprint(Fingerprint fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * This contains layer-specific metadata, if populated it has length "distance" and is ordered
   * with [distance] being the layer immediately following the base image and [1] being the final
   * layer.
   * @return value or {@code null} for none
   */
  public java.util.List<Layer> getLayerInfo() {
    return layerInfo;
  }

  /**
   * This contains layer-specific metadata, if populated it has length "distance" and is ordered
   * with [distance] being the layer immediately following the base image and [1] being the final
   * layer.
   * @param layerInfo layerInfo or {@code null} for none
   */
  public Derived setLayerInfo(java.util.List<Layer> layerInfo) {
    this.layerInfo = layerInfo;
    return this;
  }

  @Override
  public Derived set(String fieldName, Object value) {
    return (Derived) super.set(fieldName, value);
  }

  @Override
  public Derived clone() {
    return (Derived) super.clone();
  }

}
