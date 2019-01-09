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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * Provides a detailed description of a `Note`.
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
public final class Note extends com.google.api.client.json.GenericJson {

  /**
   * A note describing an attestation role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AttestationAuthority attestationAuthority;

  /**
   * A note describing a base image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Basis baseImage;

  /**
   * Build provenance type for a verifiable build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildType buildType;

  /**
   * Output only. The time this note was created. This field can be used as a filter in list
   * requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * A note describing something that can be deployed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Deployable deployable;

  /**
   * A note describing a provider/analysis type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Discovery discovery;

  /**
   * Time of expiration for this note, null if note does not expire.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expirationTime;

  /**
   * Output only. This explicitly denotes which kind of note is specified. This field can be used as
   * a filter in list requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A detailed description of this `Note`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String longDescription;

  /**
   * The name of the note in the form "providers/{provider_id}/notes/{NOTE_ID}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A note describing a package hosted by various package managers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("package")
  private ContainerAnalysisPackage package__;

  /**
   * URLs associated with this note
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RelatedUrl> relatedUrl;

  /**
   * A one sentence description of this `Note`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shortDescription;

  /**
   * Output only. The time this note was last updated. This field can be used as a filter in list
   * requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * A package vulnerability type of note.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VulnerabilityType vulnerabilityType;

  /**
   * A note describing an attestation role.
   * @return value or {@code null} for none
   */
  public AttestationAuthority getAttestationAuthority() {
    return attestationAuthority;
  }

  /**
   * A note describing an attestation role.
   * @param attestationAuthority attestationAuthority or {@code null} for none
   */
  public Note setAttestationAuthority(AttestationAuthority attestationAuthority) {
    this.attestationAuthority = attestationAuthority;
    return this;
  }

  /**
   * A note describing a base image.
   * @return value or {@code null} for none
   */
  public Basis getBaseImage() {
    return baseImage;
  }

  /**
   * A note describing a base image.
   * @param baseImage baseImage or {@code null} for none
   */
  public Note setBaseImage(Basis baseImage) {
    this.baseImage = baseImage;
    return this;
  }

  /**
   * Build provenance type for a verifiable build.
   * @return value or {@code null} for none
   */
  public BuildType getBuildType() {
    return buildType;
  }

  /**
   * Build provenance type for a verifiable build.
   * @param buildType buildType or {@code null} for none
   */
  public Note setBuildType(BuildType buildType) {
    this.buildType = buildType;
    return this;
  }

  /**
   * Output only. The time this note was created. This field can be used as a filter in list
   * requests.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time this note was created. This field can be used as a filter in list
   * requests.
   * @param createTime createTime or {@code null} for none
   */
  public Note setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * A note describing something that can be deployed.
   * @return value or {@code null} for none
   */
  public Deployable getDeployable() {
    return deployable;
  }

  /**
   * A note describing something that can be deployed.
   * @param deployable deployable or {@code null} for none
   */
  public Note setDeployable(Deployable deployable) {
    this.deployable = deployable;
    return this;
  }

  /**
   * A note describing a provider/analysis type.
   * @return value or {@code null} for none
   */
  public Discovery getDiscovery() {
    return discovery;
  }

  /**
   * A note describing a provider/analysis type.
   * @param discovery discovery or {@code null} for none
   */
  public Note setDiscovery(Discovery discovery) {
    this.discovery = discovery;
    return this;
  }

  /**
   * Time of expiration for this note, null if note does not expire.
   * @return value or {@code null} for none
   */
  public String getExpirationTime() {
    return expirationTime;
  }

  /**
   * Time of expiration for this note, null if note does not expire.
   * @param expirationTime expirationTime or {@code null} for none
   */
  public Note setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  /**
   * Output only. This explicitly denotes which kind of note is specified. This field can be used as
   * a filter in list requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Output only. This explicitly denotes which kind of note is specified. This field can be used as
   * a filter in list requests.
   * @param kind kind or {@code null} for none
   */
  public Note setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A detailed description of this `Note`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLongDescription() {
    return longDescription;
  }

  /**
   * A detailed description of this `Note`.
   * @param longDescription longDescription or {@code null} for none
   */
  public Note setLongDescription(java.lang.String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

  /**
   * The name of the note in the form "providers/{provider_id}/notes/{NOTE_ID}"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the note in the form "providers/{provider_id}/notes/{NOTE_ID}"
   * @param name name or {@code null} for none
   */
  public Note setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A note describing a package hosted by various package managers.
   * @return value or {@code null} for none
   */
  public ContainerAnalysisPackage getPackage() {
    return package__;
  }

  /**
   * A note describing a package hosted by various package managers.
   * @param package__ package__ or {@code null} for none
   */
  public Note setPackage(ContainerAnalysisPackage package__) {
    this.package__ = package__;
    return this;
  }

  /**
   * URLs associated with this note
   * @return value or {@code null} for none
   */
  public java.util.List<RelatedUrl> getRelatedUrl() {
    return relatedUrl;
  }

  /**
   * URLs associated with this note
   * @param relatedUrl relatedUrl or {@code null} for none
   */
  public Note setRelatedUrl(java.util.List<RelatedUrl> relatedUrl) {
    this.relatedUrl = relatedUrl;
    return this;
  }

  /**
   * A one sentence description of this `Note`.
   * @return value or {@code null} for none
   */
  public java.lang.String getShortDescription() {
    return shortDescription;
  }

  /**
   * A one sentence description of this `Note`.
   * @param shortDescription shortDescription or {@code null} for none
   */
  public Note setShortDescription(java.lang.String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Output only. The time this note was last updated. This field can be used as a filter in list
   * requests.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time this note was last updated. This field can be used as a filter in list
   * requests.
   * @param updateTime updateTime or {@code null} for none
   */
  public Note setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * A package vulnerability type of note.
   * @return value or {@code null} for none
   */
  public VulnerabilityType getVulnerabilityType() {
    return vulnerabilityType;
  }

  /**
   * A package vulnerability type of note.
   * @param vulnerabilityType vulnerabilityType or {@code null} for none
   */
  public Note setVulnerabilityType(VulnerabilityType vulnerabilityType) {
    this.vulnerabilityType = vulnerabilityType;
    return this;
  }

  @Override
  public Note set(String fieldName, Object value) {
    return (Note) super.set(fieldName, value);
  }

  @Override
  public Note clone() {
    return (Note) super.clone();
  }

}
