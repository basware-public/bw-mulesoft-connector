package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PostV1ExportedPurchaseOrdersExternalCodeAcknowledgeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.PostV1ExportedPurchaseOrdersExternalCodeAcknowledgeOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class PostV1ExportedPurchaseOrdersExternalCodeAcknowledgeOperation
    extends PostV1ExportedPurchaseOrdersExternalCodeAcknowledgeOperationRefinement {
  public PostV1ExportedPurchaseOrdersExternalCodeAcknowledgeOperation() {
    super();
  }

  public PostV1ExportedPurchaseOrdersExternalCodeAcknowledgeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1. Updates 'processingStatus' -field on the document to allow filtering out the document
   * on the next GET operation 2. For a document which is already acknowledged (processingStatus:
   * 'Exported'), API will return 405 'Method not allowed' if acknowledge is attempted again on the
   * document.
   *
   * <p>Please see section "[Usage scenario 4: Import and export procurement
   * data](https://developer.basware.com/api/p2p/manual#usage4)" for details on implementing this
   * API.
   *
   * <p>This operation makes an HTTP POST request to the
   * /v1/exportedPurchaseOrders/{externalCode}/acknowledge endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param externalCodeUriParam ExternalCode of the order to be acknowledged. Note: For an order
   *     which is already acknowledged, API will return 405 'Method not allowed'.
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Exported purchase orders acknowledge")
  @Summary(
      "Notes:\r\n"
          + "1. Updates 'processingStatus' -field on the document to allow filtering out the document on the next GET operation\r\n"
          + "2. For a document which is already acknowledged (processingStatus: 'Exported'), API will return 405 'Method not allowed' if acknowledge is attempted again on the document.")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1ExportedPurchaseOrdersExternalCodeAcknowledgeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1ExportedPurchaseOrdersExternalCodeAcknowledge(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("External Code")
          @Summary(
              "ExternalCode of the order to be acknowledged. Note: For an order which is already acknowledged, API will return 405 'Method not allowed'.")
          String externalCodeUriParam,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1ExportedPurchaseOrdersExternalCodeAcknowledge(
        config,
        connection,
        externalCodeUriParam,
        contentTypeHeader,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
