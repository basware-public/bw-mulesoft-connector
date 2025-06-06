package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1ExportedContractsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1ExportedContractsOperationRefinement
    extends DeleteV1ExportedContractsOperationBase {
  public DeleteV1ExportedContractsOperationRefinement() {
    super();
  }

  public DeleteV1ExportedContractsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
