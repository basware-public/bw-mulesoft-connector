package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PatchV1MatchingOrderLinesExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1MatchingOrderLinesExternalCodeOperationRefinement
    extends PatchV1MatchingOrderLinesExternalCodeOperationBase {
  public PatchV1MatchingOrderLinesExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1MatchingOrderLinesExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
