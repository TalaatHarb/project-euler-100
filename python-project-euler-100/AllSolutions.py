import time
from multiprocessing  import Process
import sys

from p001 import P001
from p002 import P002
from p003 import P003
from p004 import P004
from p005 import P005
from p006 import P006
from p007 import P007
from p008 import P008
from p009 import P009
from p010 import P010
from p011 import P011
from p012 import P012
from p013 import P013
from p014 import P014
from p015 import P015
from p016 import P016
from p017 import P017
from p018 import P018
from p019 import P019
from p020 import P020

def main(argv):
	start_time = time.time()

	if (len(argv) > 0) and argv[0]=='-p':
		solve_parallel()
	else:
		solve_sequential()
	
	total_time = time.time() - start_time
	print('Total time:', total_time, 's')

def solve_sequential():
	P001().run()
	P002().run()
	P003().run()
	P004().run()
	P005().run()
	P006().run()
	P007().run()
	P008().run()
	P009().run()
	P010().run()
	P011().run()
	P012().run()
	P013().run()
	P014().run()
	P015().run()
	P016().run()
	P017().run()
	P018().run()
	P019().run()
	P020().run()

def solve_parallel():
	processes = []

	processes.append(Process(name='p001', target=P001().run))
	processes.append(Process(name='p002', target=P002().run))
	processes.append(Process(name='p003', target=P003().run))
	processes.append(Process(name='p004', target=P004().run))
	processes.append(Process(name='p005', target=P005().run))
	processes.append(Process(name='p006', target=P006().run))
	processes.append(Process(name='p007', target=P007().run))
	processes.append(Process(name='p008', target=P008().run))
	processes.append(Process(name='p009', target=P009().run))
	processes.append(Process(name='p010', target=P010().run))
	processes.append(Process(name='p011', target=P011().run))
	processes.append(Process(name='p012', target=P012().run))
	processes.append(Process(name='p013', target=P013().run))
	processes.append(Process(name='p014', target=P014().run))
	processes.append(Process(name='p015', target=P015().run))
	processes.append(Process(name='p016', target=P016().run))
	processes.append(Process(name='p017', target=P017().run))
	processes.append(Process(name='p018', target=P018().run))
	processes.append(Process(name='p019', target=P019().run))
	processes.append(Process(name='p020', target=P020().run))

	for i in processes:
		i.start()

	for i in processes:
		i.join()


if __name__ == "__main__":
	main(sys.argv[1:])