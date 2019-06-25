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
 * The Docker execuctor specification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DockerExecutor extends com.google.api.client.json.GenericJson {

  /**
   * Required. The command or newline delimited script to run. The command string will be executed
   * within a bash shell.
   *
   * If the command exits with a non-zero exit code, output parameter de-localization will be
   * skipped and the pipeline operation's `error` field will be populated.
   *
   * Maximum command string length is 16384.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cmd;

  /**
   * Required. Image name from either Docker Hub or Google Container Registry. Users that run
   * pipelines must have READ access to the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageName;

  /**
   * Required. The command or newline delimited script to run. The command string will be executed
   * within a bash shell.
   *
   * If the command exits with a non-zero exit code, output parameter de-localization will be
   * skipped and the pipeline operation's `error` field will be populated.
   *
   * Maximum command string length is 16384.
   * @return value or {@code null} for none
   */
  public java.lang.String getCmd() {
    return cmd;
  }

  /**
   * Required. The command or newline delimited script to run. The command string will be executed
   * within a bash shell.
   *
   * If the command exits with a non-zero exit code, output parameter de-localization will be
   * skipped and the pipeline operation's `error` field will be populated.
   *
   * Maximum command string length is 16384.
   * @param cmd cmd or {@code null} for none
   */
  public DockerExecutor setCmd(java.lang.String cmd) {
    this.cmd = cmd;
    return this;
  }

  /**
   * Required. Image name from either Docker Hub or Google Container Registry. Users that run
   * pipelines must have READ access to the image.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageName() {
    return imageName;
  }

  /**
   * Required. Image name from either Docker Hub or Google Container Registry. Users that run
   * pipelines must have READ access to the image.
   * @param imageName imageName or {@code null} for none
   */
  public DockerExecutor setImageName(java.lang.String imageName) {
    this.imageName = imageName;
    return this;
  }

  @Override
  public DockerExecutor set(String fieldName, Object value) {
    return (DockerExecutor) super.set(fieldName, value);
  }

  @Override
  public DockerExecutor clone() {
    return (DockerExecutor) super.clone();
  }

}
