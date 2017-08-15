package bpmn2.tutorial;

import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractDetailComposite;
//import org.eclipse.bpmn2.modeler.core.merrimac.clad.DefaultDetailComposite;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.*;
import org.eclipse.bpmn2.modeler.core.merrimac.dialogs.*;
import org.eclipse.bpmn2.modeler.core.merrimac.providers.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;

import model.AbstractActivity;
import model.ModelFactory;
import model.ModelPackage;
import java.util.List;
//import model.ModelFactory;

import org.eclipse.bpmn2.ServiceTask;
import org.eclipse.bpmn2.di.BPMNDiagram;
//import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractBpmn2PropertySection;
//import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractDetailComposite;
import org.eclipse.bpmn2.modeler.core.model.ModelDecorator;
import org.eclipse.bpmn2.modeler.core.runtime.CustomTaskDescriptor;
import org.eclipse.bpmn2.modeler.core.runtime.TargetRuntime;
import org.eclipse.bpmn2.modeler.core.utils.BusinessObjectUtil;
import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
//import org.eclipse.jface.viewers.ISelection;
//import org.eclipse.swt.widgets.Composite;

public class MyAbstractPropertySection extends AbstractBpmn2PropertySection {

	public MyAbstractPropertySection() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	protected AbstractDetailComposite createSectionRoot() {
		// TODO Auto-generated method stub
		// This constructor is used to create the detail composite for use in the Property Viewer.
		return new MyTaskDetailComposite(this);
	}

	@Override
	public AbstractDetailComposite createSectionRoot(Composite arg0, int arg1) {
		// TODO Auto-generated method stub
		// This constructor is used to create the detail composite for use in the popup Property Dialog.
		 return new MyTaskDetailComposite(arg0, arg1);
	}

	@Override
	public EObject getBusinessObjectForSelection(ISelection arg0) {
		 //TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	public class MyTaskDetailComposite extends AbstractDetailComposite {

		 public MyTaskDetailComposite(AbstractBpmn2PropertySection section) {
			 	super(section);
		 }

		 public MyTaskDetailComposite(Composite parent, int style) {
		 super(parent, style);
		 }

		 @Override
		 public void createBindings(EObject be) {
			 // This must be a AbstractActivity because this Property Tab is only active for AbstractActivity.
			 // The Property Tab will only display the Context list in our AbstractActivity
			 // model element (see the definition of this element in MyModel.ecore). 
			 ServiceTask myServiceTask = (ServiceTask)be;
			 AbstractActivity abstractActivity = null;
			 // Fetch all TaskConfig extension objects from the Task
			 List<AbstractActivity> allAbstractActivitys = ModelDecorator.getAllExtensionAttributeValues(myServiceTask, AbstractActivity.class);
			 if (allAbstractActivitys.size()==0) {
			 // There are none, so we need to construct a new TaskConfig
			 // which is required by the Property Sheet UI.
				 abstractActivity = ModelFactory.eINSTANCE.createAbstractActivity();
			 TargetRuntime rt = getTargetRuntime();
			 // We need our CustomTaskDescriptor for this Task. The ID must match
			 // the one defined in the <customTask> extension point in plugin.xml
			 CustomTaskDescriptor ctd = rt.getCustomTask("org.imixs.workflow.bpmn.customTask");
			 //org.imixs.workflow.bpmn.customTask
			 // Get the model feature for the "abstractActivity" element name.
			 // Again, this must match the <property> element in <customTask>
			 EStructuralFeature feature = ctd.getModelDecorator().getEStructuralFeature(be, "abstractActivity");
			 // Add the newly constructed TaskConfig object to the Task's Extension Values list.
			 // Note that we will delay the actual insertion of the new object until some feature
			 // of the object changes (e.g. the Parameter.name)
			 ModelDecorator.addExtensionAttributeValue(myServiceTask, feature, abstractActivity, true);
			 }
			 else {
			 // Else reuse the existing TaskConfig object.
			abstractActivity = allAbstractActivitys.get(0);
			 }
			 // Display the Context list in AbstractActivity 
			 bindList(abstractActivity, ModelPackage.eINSTANCE.getAbstractActivity_Context());
					
		 }
	}

}
