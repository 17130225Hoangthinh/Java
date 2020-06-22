package datamining;

import weka.associations.Apriori;
import weka.associations.AssociationRules;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class apriori {

	public static void main(String[] args) throws Exception {
	Instances data=DataSource.read("E:\\học tập\\data mining\\file.arff");
	Apriori apriori= new Apriori();
	apriori.setLowerBoundMinSupport(0.3);
	apriori.setMinMetric(0.9);;
	apriori.buildAssociations(data);
	AssociationRules rules= apriori.getAssociationRules();
	for(int i=0;i< rules.getRules().size();i++) {
		System.out.println(rules.getRules().get(i).toString());
	}
	
}
}
