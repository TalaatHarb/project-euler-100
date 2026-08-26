use crate::Solvable;

pub struct P005;
impl Solvable for P005 {
    fn problem_name(&self) -> &str { "p005" }
    fn solve(&self) -> i64 {
        let last = 20i64;
        let mut result = 1i64;
        let mut sequence: Vec<i64> = Vec::new();
        let mut number = 2i64;
        let mut counter = number;
        while counter <= last {
            let mut n = number;
            for &j in &sequence {
                if n % j == 0 {
                    n /= j;
                }
            }
            result *= n;
            sequence.push(n);
            counter += 1;
            number = counter;
        }
        result
    }
}
