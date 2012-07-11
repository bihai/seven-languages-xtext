/**
 */
package org.xtext.guicemodules.guiceModules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.guicemodules.guiceModules.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuiceModulesFactoryImpl extends EFactoryImpl implements GuiceModulesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GuiceModulesFactory init()
  {
    try
    {
      GuiceModulesFactory theGuiceModulesFactory = (GuiceModulesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/guicemodules/GuiceModules"); 
      if (theGuiceModulesFactory != null)
      {
        return theGuiceModulesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GuiceModulesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiceModulesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GuiceModulesPackage.MODULES_AST: return createModulesAST();
      case GuiceModulesPackage.MODULE_AST: return createModuleAST();
      case GuiceModulesPackage.BINDING_AST: return createBindingAST();
      case GuiceModulesPackage.KEY_AST: return createKeyAST();
      case GuiceModulesPackage.IMPORT_AST: return createImportAST();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModulesAST createModulesAST()
  {
    ModulesASTImpl modulesAST = new ModulesASTImpl();
    return modulesAST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleAST createModuleAST()
  {
    ModuleASTImpl moduleAST = new ModuleASTImpl();
    return moduleAST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingAST createBindingAST()
  {
    BindingASTImpl bindingAST = new BindingASTImpl();
    return bindingAST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyAST createKeyAST()
  {
    KeyASTImpl keyAST = new KeyASTImpl();
    return keyAST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportAST createImportAST()
  {
    ImportASTImpl importAST = new ImportASTImpl();
    return importAST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiceModulesPackage getGuiceModulesPackage()
  {
    return (GuiceModulesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GuiceModulesPackage getPackage()
  {
    return GuiceModulesPackage.eINSTANCE;
  }

} //GuiceModulesFactoryImpl