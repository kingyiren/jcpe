/*
 * CPEFrame.java
 *
 * Created on 2008年11月9日, 下午3:58
 */

package cn.edu.njupt.sc.GUI;

import java.awt.EventQueue;

import cn.edu.njupt.sc.CPECore;

/**
 * 
 * @author smartzxy
 */
public class CPEFrame extends javax.swing.JFrame {

	/** Creates new form CPEFrame */
	public CPEFrame() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		textAreaData = new javax.swing.JTextArea();
		jLabel2 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		textAreaState = new javax.swing.JTextArea();
		buttonStart = new javax.swing.JButton();
		buttonShutdown = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("CPE端演示器");

		jLabel1.setText("接收的数据：");

		textAreaData.setColumns(20);
		textAreaData.setRows(5);
		jScrollPane1.setViewportView(textAreaData);

		jLabel2.setText("系统状态：");

		textAreaState.setColumns(20);
		textAreaState.setRows(5);
		jScrollPane2.setViewportView(textAreaState);

		buttonStart.setText("开   机");
		buttonStart.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonStartActionPerformed(evt);
			}
		});

		buttonShutdown.setText("关   机");
		buttonShutdown.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonShutdownActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																643,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																643,
																Short.MAX_VALUE)
														.addComponent(jLabel1)
														.addComponent(jLabel2)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				buttonShutdown)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				buttonStart)))
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												142,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												142,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																buttonStart)
														.addComponent(
																buttonShutdown))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { jScrollPane1, jScrollPane2 });

		jTabbedPane1.addTab("状态监控", jPanel2);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 679,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446,
				Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void buttonStartActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonStartActionPerformed
		// TODO add your handling code here:
		/*
		 * EventQueue.invokeLater(new Runnable() { public void run() { new
		 * CPECore().turnOn(); } });
		 */
		CPECore core = new CPECore();
		core.turnOn(this);
//		CPEThread thread=new CPEThread(this);
//		do{
//			thread.run();
//			try {
//				thread.sleep(5*1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}while(true);
	}// GEN-LAST:event_buttonStartActionPerformed

	private void buttonShutdownActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonShutdownActionPerformed
	// TODO add your handling code here:
		System.exit(0);
	}// GEN-LAST:event_buttonShutdownActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CPEFrame().setVisible(true);
			}
		});
	}

	public void insertDate(String date) {
		this.textAreaData.append(date);
	}

	public void insertState(String state) {
		this.textAreaState.append(state);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton buttonShutdown;
	private javax.swing.JButton buttonStart;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextArea textAreaData;
	private javax.swing.JTextArea textAreaState;
	// End of variables declaration//GEN-END:variables

}
